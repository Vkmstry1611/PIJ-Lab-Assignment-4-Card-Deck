

## Name: `Vidish  Ketankumar Mistry`
## PRN: `23070126146`  
## Batch: `B-3` 

---

## **Overview**
This Java program simulates a standard **52-card deck** with various functionalities such as **shuffling, printing, comparing, searching**, and **dealing cards**. It is a **menu-driven program** that allows the user to interact with the deck.

### **Files Included**
1. **Card.java** - Represents an individual playing card.
2. **Deck.java** - Manages the deck and card operations.
3. **Main.java** - Implements the menu-driven user interface.

---

## **File: `Card.java`**
This class represents a single **playing card**.

### **Attributes:**
- `rank` (String) → Stores the card rank (e.g., "2", "J", "A").
- `suit` (String) → Stores the card suit (e.g., "Hearts", "Spades").

### **Methods:**
| Method          | Description |
|----------------|------------|
| `Card(String rank, String suit)` | Constructor to initialize a card with a rank and suit. |
| `getRank()` | Returns the rank of the card. |
| `getSuit()` | Returns the suit of the card. |
| `toString()` | Returns the card in "Rank of Suit" format (e.g., "10 of Hearts"). |

---

## **File: `Deck.java`**
This class **manages the deck** and provides various operations.

### **Attributes:**
- `deck` (ArrayList<Card>) → Stores the list of 52 playing cards.

### **Methods:**
| Method          | Description |
|----------------|------------|
| `Deck()` | Constructor that initializes the deck and calls `createDeck()`. |
| `createDeck()` | Populates the deck with 52 unique cards. |
| `printDeck()` | Prints all cards in the deck. |
| `printCard(int index)` | Prints a specific card based on the given index (0-51). |
| `sameCard(Card c1, Card c2)` | Returns `true` if two cards have the same suit. |
| `compareCard(Card c1, Card c2)` | Returns `true` if two cards have the same rank. |
| `findCard(String rank, String suit)` | Checks if a specific card exists in the deck. |
| `shuffleDeck()` | Shuffles the deck randomly. |
| `dealCard()` | Prints 5 random cards from the deck. |

---

## **File: `Main.java`**
This file **implements the menu-driven system** allowing users to interact with the deck.

### **Menu Options:**
| Option | Description |
|--------|------------|
| `1` | Print the entire deck. |
| `2` | Shuffle the deck. |
| `3` | Print a specific card by index. |
| `4` | Compare two cards (by suit and rank). |
| `5` | Search for a specific card. |
| `6` | Deal 5 random cards. |
| `7` | Exit the program. |

### **Main Method:**
- Initializes a `Deck` object.
- Uses a **while-loop** to display the menu.
- Reads user input and calls appropriate `Deck` methods.

