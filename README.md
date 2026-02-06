# CritterProject

A grid-based animal simulation built in Java. Different critter types roam a 100x50 world, each following unique movement patterns. When critters collide, one is eliminated. A Swing GUI lets you watch the simulation play out in real time.

**Author:** Peter Roumeliotis | November 2021

## Critter Types

| Critter | Symbol | Movement |
|---------|--------|----------|
| Bird    | B      | Random direction each step |
| Frog    | F      | 3 steps in a random direction, then picks a new one |
| Mouse   | M      | Alternates between West and North |
| Turtle  | T      | Walks in a square (5S, 5W, 5N, 5E) |
| Wolf    | W      | 3 steps North, 2 steps South |

The simulation starts with 25 of each type (125 critters total). The world wraps around — moving off one edge brings you to the opposite side.

## Running

Requires a Java Development Kit (JDK).

```bash
javac CritterProject/*.java
java CritterProject.CritterMain
```

## Controls

- **Start** — Run the simulation continuously
- **Stop** — Pause the simulation
- **Step** — Advance one frame at a time

A live count of each critter type is displayed on the right side of the window.

## Project Structure

```
CritterProject/
├── CritterMain.java      # Entry point
├── CritterFrame.java     # GUI window and controls
├── CritterPanel.java     # Grid rendering
├── CritterModel.java     # Simulation logic and collision detection
├── Critter.java          # Interface all critters implement
├── CritterInfo.java      # Interface for querying surroundings
├── Bird.java             # Random mover
├── Frog.java             # Burst mover
├── Mouse.java            # Diagonal zigzagger
├── Turtle.java           # Square walker
└── Wolf.java             # North-south pacer
```

## Tech Stack

Pure Java — Swing/AWT for the GUI, no external dependencies.
