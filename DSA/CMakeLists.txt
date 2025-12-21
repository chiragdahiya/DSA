cmake_minimum_required(VERSION 3.10)
project(DSA CXX)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -Wall -Wextra -O2")

# Output directory for executables
set(CMAKE_RUNTIME_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/bin)

# DSA folder programs
file(GLOB DSA_SOURCES "DSA/*.cpp")
foreach(source ${DSA_SOURCES})
    get_filename_component(name ${source} NAME_WE)
    add_executable(dsa_${name} ${source})
endforeach()

# greaterN folder programs
file(GLOB GREATERN_SOURCES "greaterN/*.cpp")
foreach(source ${GREATERN_SOURCES})
    get_filename_component(name ${source} NAME_WE)
    add_executable(greatern_${name} ${source})
endforeach()

# Lec 1 folder programs
file(GLOB LEC1_SOURCES "Lec 1/*.cpp")
foreach(source ${LEC1_SOURCES})
    get_filename_component(name ${source} NAME_WE)
    add_executable(lec1_${name} ${source})
endforeach()

# Lec 2 folder programs
file(GLOB LEC2_SOURCES "Lec 2/*.cpp")
foreach(source ${LEC2_SOURCES})
    get_filename_component(name ${source} NAME_WE)
    add_executable(lec2_${name} ${source})
endforeach()

# Lec 2 patterns folder
file(GLOB LEC2_PATTERNS_SOURCES "Lec 2/patterns/*.cpp")
foreach(source ${LEC2_PATTERNS_SOURCES})
    get_filename_component(name ${source} NAME_WE)
    add_executable(lec2_patterns_${name} ${source})
endforeach()

# Lec4 folder programs
file(GLOB LEC4_SOURCES "Lec4/*.cpp")
foreach(source ${LEC4_SOURCES})
    get_filename_component(name ${source} NAME_WE)
    add_executable(lec4_${name} ${source})
endforeach()

# Sorting folder programs
file(GLOB SORTING_SOURCES "Sorting/*.cpp")
foreach(source ${SORTING_SOURCES})
    get_filename_component(name ${source} NAME_WE)
    add_executable(sorting_${name} ${source})
endforeach()
