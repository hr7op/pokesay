@echo off
echo.
echo ========================================
echo    POKESAY - Setup and Compilation
echo ========================================
echo.

cd src

echo [1/3] Compiling all Java files...
javac -d ../bin pokesay.java PokesayLogo.java checks/*.java styles/*.java utils/*.java

if %ERRORLEVEL% NEQ 0 (
    echo.
    echo [ERROR] Compilation failed! Please check the errors above.
    pause
    exit /b 1
)

echo [2/3] Compilation successful!
echo.

java -cp ../bin PokesayLogo

echo.
echo ========================================
echo    Setup Complete!
echo ========================================
echo.
echo To run pokesay, use:
echo   java -cp bin pokesay [pokemon] [message]
echo.
echo Example:
echo   java -cp bin pokesay 025 Hello World
echo.
pause
