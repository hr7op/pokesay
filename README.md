# pokesay

pokesay is a small terminal utility (Java) inspired by cowsay and Pokédex ASCII art. It prints an ASCII-art Pokémon alongside a styled message. The project includes a startup logo that displays once during initial setup.

---

## Features

-   Print ASCII art for Pokemon (first 120 supported)
-   Color and text-style formatting (ANSI colors and styles)
-   Simple command-line interface
-   One-time setup script that shows a welcoming logo

---

## Requirements

-   Java JDK 11+ (javac/java on PATH)
-   Windows PowerShell (script uses `setup.bat`, but you can also use `javac` / `java` manually)

---

## Quick start (recommended)

1. Open PowerShell in the project root (where `setup.bat` lives).
2. Run the setup script:

```powershell
./setup.bat
```

This will:

-   Compile the source files into `bin/`
-   Display a colorful pokesay welcome logo (only during setup)
-   Print instructions to run the program

---

## Manual compile & run

If you prefer to compile manually:

```powershell
cd src
javac -d ../bin pokesay.java PokesayLogo.java checks\*.java styles\*.java utils\*.java
cd ..
java -cp bin pokesay 025 "Your message here"
```

---

## Usage

```
java -cp bin pokesay [PokemonNameOrIndex] [-optional command] [message]
```

Examples:

```powershell
# By numeric index (three-digit format works, e.g. 025 = Pikachu)
java -cp bin pokesay 025 "Pikachu says hello!"

# By Name (capitalized first letter)
java -cp bin pokesay Pikachu "Electrifying vibes"

# With color
java -cp bin pokesay 004 -c blue "My name is Char-mander, I just hold a single letter"

# Styles
java -cp bin pokesay 001 -b "Bold message"
java -cp bin pokesay 001 -u "Underlined message"

# Help
java -cp bin pokesay -h
```

---

## Supported colors & styles

-   Colors (for `-c`): black, red, green, yellow, blue, magneta, cyan, white (default)
-   Styles (boolean flags): `-b` (bold), `-i` (italic), `-u` (underline), `-st` (strikethrough), `-d` (dim)

If your terminal doesn't support a style, rendering may not appear as expected.

---

## Screenshots

The project includes screenshots under the repository root in the `screenshots/` directory (if present). Here are inline previews you can use in documentation or README viewers.

![Output example - Charmander](./assets/charmander-example.png)

![Setup Logo](./assets/setup-logo.png)

> Note: If images don't exist in your repo, replace those with local screenshots or remove the image links.

---

## Project layout

```
README.md
setup.bat
ascii/         # pokemon ascii files and pokedex index
bin/           # compiled classes (after setup)
src/           # source code
    pokesay.java
    PokesayLogo.java
    checks/ ...
    styles/ ...
    utils/  ...
```

---

## Troubleshooting

-   Compilation errors: ensure your `javac` is on PATH and you're running the script from the project root.
-   If `pokedex.txt` or ascii files are missing, the program will fail to load art — ensure `ascii/` contains the files and `PokemonList` correct path (defaults to `D:\OneDrive\Desktop\pokesay\ascii\`).

---

## Contributing

Feel free to open issues or PRs. Suggestions:

-   Support all Pokédex entries
-   Add more terminal compatibility checks
-   Improve Windows/Unix cross-platform paths

---

## License

MIT