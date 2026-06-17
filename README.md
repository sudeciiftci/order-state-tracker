# order-state-tracker

A console-based Java project that simulates an e-commerce order management system. Built to practice `enum` usage naturally — not forced, but as a real solution to a real problem.

## What it does

- Create orders with customer name, product, and price
- Track order status through its lifecycle
- Handle payment status separately
- Cancel orders with automatic refund logic

## Order lifecycle

```
PREPARING → SHIPPED → DELIVERED
              ↓
           CANCELLED
```

## Payment lifecycle

```
PENDING → PAID
            ↓
         REFUNDED (if order is cancelled)
```

## Project structure

```
src/
├── enums/
│   ├── OrderStatus.java      # PREPARING, SHIPPED, DELIVERED, CANCELLED
│   └── PaymentStatus.java    # PENDING, PAID, REFUNDED
├── model/
│   └── Order.java            # Order entity with all fields
├── service/
│   └── OrderService.java     # Business logic
└── main/
    └── Main.java             # Entry point
```

## Tech

- Java
- VS Code
- No frameworks, no libraries — pure Java
