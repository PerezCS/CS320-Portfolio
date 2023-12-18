# CS320-Portfolio

**How can I ensure that my code, program, or software is functional and secure?**

To ensure the code in the Contact, Task, and Appointment classes were functional, I used a mix of static and dynamic testing methods. The static testing was performed before runtime by reviewing code for errors or inaccuracies during the project’s development of the three class services. For example, ensuring that the test cases for setting up a future appointment properly assigns this future date from the current time. Dynamic testing was utilized through JUnit tests, where each service’s class files had their own dedicated testing class files. For security and stability, input validation is utilized with each class file’s setters, thereby ensuring that an input is within an expected range. If this requirement is not met, the program would throw an error, such as “Invalid task name" when a user tries to create a task with a name that is not within 20 characters and not null.

---

**How do I interpret user needs and incorporate them into a program?**

Understanding the user's needs means breaking down each requirement into several equations or limits necessary for testable code. When a field needed to be within a non-null length of characters, I converted this into tests that would check for every possible case, whether it be within range, outside range, or empty/null. Additionally, in order to meet efficient data management needs, each service allowed for the adding and removing of user entries.

---

**How do I approach designing software?**

This project focused on a modular design with three main features that were similar in overall structure. Each feature was separated into its own classes with each one having its own clear responsibilities. For instance, the Contact class defines all fields and requirements of a created contact while ContactService manages these contacts. I also implemented reusable and consistent code patterns, which can be seen in test classes like ContactTest, AppointmentTest, and TaskTest, enhancing maintainability.
