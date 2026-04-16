# Lab Assignment 7: Prototype Design Pattern

## Overview
This repository contains a Java implementation of the **Prototype Design Pattern**, based on a specific UML diagram assignment. 

This codebase serves as a demonstration of the **Prototype Design Pattern** in Java. 

The Prototype pattern is a creational design pattern that lets us copy existing objects without making our code dependent on their classes. Instead of instantiating new objects from scratch using the `new` keyword, this system:
1. Creates a set of "prototype" objects during the `DocumentRegistry` initialization.
2. Clones these prototypes whenever a new document is requested.
3. Modifies the cloned instances with specific data (like filename, author, or page count) before returning them.

### Code Structure
* **`Document` (Interface):** Defines the `clone()`, `open()`, and `getType()` methods. Extends `Cloneable`.
* **Concrete Prototypes:** `PdfDocument`, `TextDocument`, and `SpreadsheetDocument` implement the `Document` interface and define their specific attributes.
* **`DocumentRegistry`:** Holds the initial prototype instances and provides methods (`createPdf`, `createText`, `createSpreadsheet`) to clone and customize them.
* **`ProcessedDocument` (Main):** The execution class that utilizes the registry to generate and open various document types, printing the required output to the console.

---

## UML Diagram:
<img width="4371" height="1504" alt="image" src="https://github.com/user-attachments/assets/b0cd8786-b15f-4743-85b9-bdd711fb28d2" />
