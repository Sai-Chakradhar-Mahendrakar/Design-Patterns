# Chain of Responsibility Design Pattern - Task

## Problem Statement

You are tasked with designing and implementing a **Customer Support System** that processes customer support requests at various levels of complexity. The system should handle different types of support requests, such as **general queries**, **technical issues**, and **urgent escalations**. The responsibility of handling these requests should be distributed across multiple support levels, with each level either processing the request or passing it to the next handler in the chain.

The support system consists of:

1. **Level 1 Support**:
   - Handles general, basic customer queries.
   
2. **Level 2 Support**:
   - Handles more complex technical issues that Level 1 cannot resolve.
   
3. **Manager**:
   - Handles urgent requests and escalations that the previous levels could not resolve.

The system should be designed using the **Chain of Responsibility Pattern**, where:
- Each handler has the responsibility to either handle a request or pass it to the next handler in the chain.
- The system should allow easy addition, removal, or modification of the handlers without affecting the overall structure.

## Functional Requirements:
- The system must define a **Request** class that contains:
  - The **type of request**: General, Technical, or Urgent.
  - A **message** describing the request.
  
- Define an abstract **Handler** class or interface, which includes:
  - A method to process the request.
  - A method to set the next handler in the chain.

- Implement concrete handlers for each support level:
  - **Level 1 Support**: Handles general queries.
  - **Level 2 Support**: Handles technical issues.
  - **Manager**: Handles urgent escalations.

- The chain of responsibility should be dynamic, allowing:
  - Requests to pass through each handler until it is processed.
  - If a handler cannot process a request, it should forward it to the next handler in the chain.
  - If no handler can handle the request, the system should log that the request was unhandled.

## Non-functional Requirements:
- **Modularity**: Ensure that the system is modular and can easily scale by adding or removing support levels.
- **Logging**: Provide feedback at each stage of the request handling process to indicate which handler is processing the request.

## Example Use Case:

1. A customer submits a **general query**:
   - The request is handled by **Level 1 Support**.

2. A customer submits a **technical issue**:
   - The request is passed from **Level 1** to **Level 2 Support**, which handles it.

3. A customer submits an **urgent escalation**:
   - The request is passed from **Level 1 Support** to **Level 2 Support**, and finally to the **Manager**, who handles it.

## Class Diagram:
1. **Request Class**:
   - Attributes: `type` (General, Technical, Urgent), `message` (String).

2. **Handler Interface/Abstract Class**:
   - `processRequest(Request request)`: Handles or passes the request.
   - `setNextHandler(Handler handler)`: Sets the next handler in the chain.

3. **Concrete Handlers**:
   - `Level1Support`, `Level2Support`, `Manager`: Each class processes the request or passes it to the next handler.

4. **Chain Setup**:
   - Chain sequence: `Level 1 Support → Level 2 Support → Manager`.

## Expected Output:
1. A **general query** is handled by **Level 1 Support**.
2. A **technical issue** is handled by **Level 2 Support** after being forwarded by **Level 1**.
3. An **urgent escalation** is handled by the **Manager** after being passed through all lower levels.
