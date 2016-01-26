@echo off
echo --------------start gen idls---------------
SetLocal EnableDelayedExpansion   
cd %~dp0
FOR  %%i IN (*) DO ( protoc -I=./  --java_out=../src/main/java  %%i & echo %%i done)

EndLocal

echo --------------idls done---------------
