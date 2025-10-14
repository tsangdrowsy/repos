## Repository snapshot

This is a small Java learning/demo project with multiple standalone example classes under `Demo/src/`.
Key entry points (main methods): `Execute.java`, `MainGV.java`, `Virtualdemo.java`.

## Big-picture architecture (short)

- Single-module Java source layout, no package declarations. All classes live in `Demo/src/` and are compiled/run as top-level classes.
- The project is not a Maven/Gradle project — there is no build manifest. Tools and actions should assume raw `javac`/`java` usage or the IDE's default Java runner.
- Data files live at repository root: `dsBook.xml`, `giaovien.xml`. Classes parse these XML files directly by filename/path.

## Why things are structured this way

- This is a teaching/demo repository: small, self-contained examples demonstrating inheritance (`Virtualdemo`, `Employee_Poly`, `Salary`), DOM XML parsing (`DSBook`, `DanhSachGiaoVien`), sorting, and basic I/O.

## Useful workflows (what an agent will need to do)

- Run an example from the `Demo/src` folder by compiling and running the single Java file. Example (Windows PowerShell):

  ```powershell
  cd Demo/src
  javac Execute.java DSBook.java Book.java
  java Execute
  ```

- If a program reads XML, ensure the working directory contains the XML file(s). `DSBook.ReadXML()` expects `dsBook.xml` in the process working directory (repository root when run from project root). `MainGV` calls `docTuFileXML("giaovien.xml")` and expects `giaovien.xml` in the same place.

- Because classes have no packages, keep compile/run commands in the folder containing `.java` files or use fully qualified paths.

## Project-specific conventions and patterns

- No package declarations — do not add packages without updating compile/run commands.
- XML parsing uses DOM (javax.xml.parsers + org.w3c.dom). Look at `DSBook.java` for canonical parsing + value extraction and `DanhSachGiaoVien.java` for simple element mapping.
- Sorting/comparison: `DSBook.sapxepDS()` sorts books by a Comparator `Book.BookPrice` (see `Book.java`), and `DanhSachGiaoVien` uses Java 8+ Comparator idioms.
- Error handling: many examples print stack traces or messages and continue; expect minimal defensive patterns.

## Examples to reference when making changes

- Add a new demo that reads `dsBook.xml`: copy `DSBook.java` style — use DocumentBuilderFactory, call `getElementsByTagName("book")`, then extract child tags.
- To add a new runnable example, add a class with `public static void main(String[] args)` to `Demo/src/` and document required XML/resource files near the top of the file.

## Tests and build system

- There is no automated test or CI config. Keep changes small and locally runnable. Use `javac` then `java` to validate.

## Integration points / External deps

- Uses only JDK APIs and org.w3c DOM classes — no external libraries. Assume JDK 8+ available.

## When you edit code

- Preserve the single-directory, package-less layout or update instructions accordingly.
- If you add new example files that require resources, update this file and the top of the example with a short comment on the expected working directory and required files.

## Quick checklist for agents

1. Locate the runnable class (`Execute`, `MainGV`, `Virtualdemo`) to reproduce behavior.
2. If XML is involved, ensure `dsBook.xml` or `giaovien.xml` are present in the working directory.
3. Compile with `javac` from `Demo/src` or use an IDE; run with `java ClassName`.
4. Avoid adding package statements without also adding a build manifest (Maven/Gradle) and updating run steps.

---
If anything here is unclear or you want more specific instructions (for example: adding a Gradle build, or standardizing on package names), tell me which approach you prefer and I will update this file.
