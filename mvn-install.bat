@echo off

REM
REM
REM Autor: Cris Stanza, 17-Ago-2015
REM

for %%I in (.) do set PROJECT_DIR=%%~nI%%~xI
cd %PROJECT_DIR%
call mvn clean install
cd ..

pause
