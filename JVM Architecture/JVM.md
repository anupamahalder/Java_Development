### 1. JVM (Java Virtual Machine)
#### What is JVM?
The Java Virtual Machine (JVM) is an abstract machine that enables Java programs to run on any platform. It executes Java bytecode and provides platform independence.

----
##### 👉 Key Point:
Java is platform-independent because of JVM, not because of Java itself.

### JVM Responsibilities:
1. Loads class files
2. Verifies bytecode
3. Executes bytecode
4. Manages memory
5. Handles garbage collection

----

### JVM Architecture:
The JVM consists of the following main components:

#### 1. Class Loader Subsystem:
1. Loads .class files into memory
2. Ensures classes are loaded only once

##### Types of Class Loaders:
1. Bootstrap Class Loader
2. Extension Class Loader
3. Application Class Loader

#### 3. Runtime Data Areas
1. Method Area – Stores class-level data
2. Heap Area – Stores objects and instance variables
3. Stack Area – Stores method calls and local variables
4. PC Register – Tracks current instruction
5. Native Method Stack – Used for native code
   
#### 4. Execution Engine:
1. Interpreter
2. JIT (Just-In-Time) Compiler
3. Garbage Collector
   
----

### JVM Flow:
.java → Compiler → .class (Bytecode) → JVM → Machine Code → Output
