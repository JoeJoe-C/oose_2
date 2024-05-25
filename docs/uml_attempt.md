# UML attempt full program

```mermaid
---
title: BikeSimulator Program
---

classDiagram

namespace Model {
    class BikeShop {
        <<interface>>
    }

    class BikeInventory { 
        <<interface>>
    }

    class BikeProduct { 
        <<interface>>
    }
}

namespace View {
    class GeneralView {
        <<interface>>
    }
}

namespace Controller {
    class EventManager { 
        <<interface>>
    } 
}
```
