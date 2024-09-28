# Observer Design Pattern - News Notification System

## Problem Statement

You are tasked with developing a **notification system** for an **online news platform** using the **Observer Design Pattern**. The platform publishes different categories of news such as **sports**, **technology**, and **politics**. Subscribers can register their interest in one or more categories, and they should receive notifications whenever new news in their chosen category is published.

### Functional Requirements:

1. **Publisher (Subject)**:
    - The platform can publish news articles under different categories (e.g., sports, technology, politics).
    - Each category has its own list of subscribers.
    - When a new article is published, only the subscribers interested in that category should be notified.
  
2. **Subscribers (Observers)**:
    - Subscribers can subscribe to multiple categories.
    - Subscribers should be able to unsubscribe from any category.
    - Once subscribed, the subscriber receives a notification whenever news in their chosen category is published.
  
3. **Notifications**:
    - Notifications should include the **title** and **content** of the news article.
    - Notifications should be sent to the subscribers in real-time when the article is published.

### Non-Functional Requirements:

- **Scalability**: The system should be able to handle hundreds or thousands of subscribers and publishers.
- **Decoupling**: The publishers and subscribers should be loosely coupled, making it easy to add new categories or subscribers without changing the core system.
- **Reusability**: The notification system should be reusable for future notification categories beyond news articles.

---

## Example Scenario

1. **Subscription**:
    - Subscriber A subscribes to **Sports**.
    - Subscriber B subscribes to **Technology**.
    - Subscriber C subscribes to both **Sports** and **Politics**.

2. **Publishing**:
    - A new **Sports** article is published.
        - Subscriber A and Subscriber C should receive a notification.
    - A new **Technology** article is published.
        - Subscriber B should receive a notification.
    - A new **Politics** article is published.
        - Subscriber C should receive a notification.

3. **Unsubscription**:
    - Subscriber A unsubscribes from **Sports** and will no longer receive notifications for sports news.

---

## Classes and Interfaces

### 1. **Subject (NewsPublisher Interface)**:
   - Responsible for managing subscribers.
   - Notifies subscribers when there is an update.
   - Provides methods for adding, removing, and notifying subscribers.

### 2. **ConcreteSubject (CategoryNewsPublisher)**:
   - Implements the Subject interface and manages a specific news category (e.g., sports, technology).
   - Keeps track of subscribers for that category.

### 3. **Observer (Subscriber Interface)**:
   - Defines an interface for receiving notifications from the subject.

### 4. **ConcreteObserver (ConcreteSubscriber)**:
   - Implements the Subscriber interface.
   - Receives and handles notifications for news updates.

---

## Expected Output

1. **Subscription**:
    - When a subscriber subscribes to a category, they should start receiving notifications for that category.

2. **Notification**:
    - When a new article is published in a category, the system should notify all subscribers of that category.
  
3. **Unsubscription**:
    - If a subscriber unsubscribes from a category, they should no longer receive notifications for that category.

---

This task will help you design a **notification system** that follows the **Observer Design Pattern**, enabling efficient and decoupled communication between publishers and subscribers.
