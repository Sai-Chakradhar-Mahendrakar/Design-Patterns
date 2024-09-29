# Problem Statement: File Loading System with Proxy Design Pattern

## Objective
Design and implement a **File Loading System** that manages access to large files using the **Proxy Design Pattern**. The proxy should provide controlled access to the actual file loading process, ensuring that files are loaded only when necessary and that access is restricted to authorized users.

## Functional Requirements

1. **FileLoader Interface**:
   - The system should define a common interface for loading files that both the **real file loader** and **proxy** will implement.

2. **File Loading**:
   - The file loading process should simulate a resource-intensive operation (e.g., loading from disk).
   - The **Proxy** should delay loading the file until it’s actually requested (lazy loading).
   
3. **Access Control**:
   - The proxy should restrict access to the file based on the user’s role.
   - Only users with the **admin** role should be able to load the file.

4. **Proxy Responsibilities**:
   - The **Proxy** object should:
     - Control access to the real file loader.
     - Handle lazy initialization (load the file only when needed).
     - Restrict access based on the user role.

## Non-Functional Requirements:
- **Efficiency**: The system should not load files unnecessarily, improving performance by implementing lazy loading.
- **Security**: Only authorized users should be able to access certain files, ensuring restricted access to sensitive resources.
- **Transparency**: The client code should interact with the proxy just as it would with the real object, without being aware of the existence of the proxy.

## Example Scenario

1. **Admin User**: 
   - An admin user requests access to a large file. 
   - The proxy checks the user's role and allows access.
   - The file is loaded (only on the first access) and subsequent accesses use the already loaded file.

2. **Guest User**: 
   - A guest user attempts to load the file.
   - The proxy denies access, stating that the user does not have sufficient permissions.

## Classes and Interfaces

1. **FileLoader (Subject Interface)**:
   - Defines the common interface with a method `loadFile()` that both the real file loader and the proxy must implement.

2. **RealFileLoader (RealSubject)**:
   - Implements the actual functionality of loading the file. This simulates the expensive process of loading a file from disk.

3. **FileLoaderProxy (Proxy)**:
   - Controls access to the `RealFileLoader`.
   - Delays the file loading until it's needed (lazy initialization).
   - Ensures that only authorized users (admins) can load the file.

4. **Client**:
   - The client will interact with the file loader through the proxy, which will determine whether to load the file or deny access.

## Task
Implement the **Proxy Design Pattern** to create a system where:
1. A file is only loaded when necessary (lazy loading).
2. Access to the file is restricted to authorized users (admins only).

The system should provide an interface that clients can use to load files without knowing whether they are interacting with the real file loader or a proxy.
