## **Project Overview**

This project implements a Domain-Specific Modeling Language (DSML) tailored for modeling real-time **TaskSets**. It features a complete pipeline from metamodel definition (using EMF/Ecore) and model validation (Java) to automated Model-to-Text (M2T) transformation generating functional C POSIX threads code using Acceleo (MTL).

A note, `note.md`, was written while conducting the experiment following the tutorial. It records how each step is performed, as well as some critical outputs in the experiment.

The organization of the project is:
- Folder `eclipse-workplace` is the workplace of Eclipse. 
- Folder `runtime-New_configuration` is the runtime configuration.
- Folder `images` is the pictures recorded during the experiment, also serves as illustration pictures in the note `note.md`.


## **Features**

### Domain Analysis & Metamodeling
*   **TaskSet**: The root element containing multiple tasks.
*   **Tasks**: Supports both Periodic and Sporadic thread kinds. Embedded with a behavior attribute to store thread execution logic.
*   **Ports & Connections**: Tasks communicate via Input/Output ports and Connections.
*   **Qualified Naming**: Implemented custom `getQualifiedName()` for `PortImpl`, `ConnectionImpl`, and `NamedElementImpl` to generate names dynamically (e.g., `TaskName.PortName` or `ConnectionName:SourcePort->DestPort`).

### Model Validation Constraints
Custom Java validation rules have been enforced to guarantee the correctness of the models before code generation:
*   **Unique Names**: Ensures task names and port names are unique across their respective containers (`UniqueTaskNames`, `UniquePortNames`).
*   **Valid Queue Size**: Validates that destination tasks handle data at an appropriate rate relative to source instances (`ValidQueueSize = dstPeriod / srcPeriod`).
*   **Connection Validity**: Ensures connected ports have matching datatypes (`SameDatatype`) and correct directions (`ValidDirection` - Source must be OUT, Destination must be IN).

### Real-Time Updates in Editor
Modified `PortItemProvider.java` and `ConnectionItemProvider.java` to reflect `QualifiedName` in the tree view instead of basic names. Overrode `notifyChanged()` to allow real-time graph refreshing upon model updates.

### Model-to-Text (M2T) Transformation
Automated generation of multithreaded C application (`main.c`) utilizing Acceleo (`.mtl` files).
*   **Thread Creation & Join**: Dynamically generates `pthread_create` and `pthread_join` for tasks based on model elements (`NB_THREADS`).
*   **Periodic & Sporadic Tasks Configuration**: Appropriately generates initialization structs (`init_periodic_config`, `init_sporadic_config`) based on the task's `ThreadKind`.
*   **Task Behavior Integration**: Injects the string-based behavior attribute into the generated infinite `while(1)` loops of the corresponding thread bodies.
*   **Name Normalization**: Automatically maps model names to permissible C variables (e.g., replacing `-` with `_`).

## **Runtime Environment**
*   **Platform**: Tested on Windows 11 under WSL (Windows Subsystem for Linux), running generated POSIX thread simulations.
*   **Execution**: The generated C code (`main.c`) can be compiled with standard `gcc` (linking `pthread`) to run the real-time simulation.

## **How to use**
1.  Open the workspace in Eclipse Modeling Tools.
2.  Define the `TaskSet` model using the generated tree-editor and Properties view.
3.  Validate the model (Right-click -> Validate).
4.  Run the Acceleo M2T generator to yield `main.c`.
5.  Compile and run the generated C code in a Linux/WSL environment.
