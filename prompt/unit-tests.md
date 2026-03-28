# Unit Testing Conventions

## Naming

* All unit tests must be defined using the JUnit `@DisplayName` annotation.
* The text inside the `@DisplayName` annotation must follow the Given-When-Then acceptance criteria pattern.
* The name of the test method itself should be concise and summarize the test's intent.

**Example:**
```java
@Test
@DisplayName("""
    Given an initial condition, 
    when an action is executed, 
    then an expected result is obtained
""")
void conciseMethodName() {
    // ...
}
```

## Dependencies

* **Frameworks**: Whenever possible, unit tests should be written exclusively using **JUnit** and **Mockito**.
* **Avoid Spring Context**: Do not use Spring annotations such as `@SpringBootTest` or `@ExtendWith(SpringExtension.class)`. They load framework dependencies that can pollute the isolated test context.
* **No Reflection**: Do not use Java Reflection to test private methods directly, as this violates basic Object-Oriented Programming principles.
* **No Static Mocking**: Do not use `mockito-inline` (or similar tools) to modify or mock the behavior of static methods.

## Design Patterns

* **KISS Principle (Keep It Simple, Stupid)**: Unit tests must be simple, direct, and intuitive, to the point that anyone (e.g., a Project Manager) can read the `@DisplayName` and understand the testability of the business rules.
* **Testability through Refactoring**: If a test becomes too complex, the class being tested should be refactored to make it more testable (e.g., isolating behaviors and dependencies).
* **Single Responsibility Principle (SRP) in Tests**: A test should have only one reason to fail, meaning it must test a single specific behavior. Consequently, the fewer assertions a test contains, the more unitary it becomes.

## Test Types

* **Controller Tests**:
    * **Standalone Setup**: `MockMvc` must be configured manually (e.g., using `MockMvcBuilders.standaloneSetup()`) instead of relying on Spring's dependency injection (`@Autowired`). This prevents loading unnecessary context.
    * **Scope of Testing**: Tests must focus solely on web-layer concerns: endpoint definitions (GET, POST, PUT, DELETE, etc.), data input validation (payloads, headers), authorization, and authentication.
    * **No Business Logic**: Controller tests must not test business rules. Business logic testing must be strictly delegated to the tests of the respective Service classes.
