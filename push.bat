:: DISCLAIMER: This file has nothing to do with the mod,
:: it only exists because I'm too lazy to always open up
:: my command prompt to push changes. This is an automation
:: for, well, pushing changes quickly.

@echo off
setlocal

set /p commitMessage=Commit Message: 

git add .
git commit -m "%commitMessage%"
git push origin master

pause