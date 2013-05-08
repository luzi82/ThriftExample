#!/bin/bash

#sudo apt-get install libboost-dev libboost-test-dev libboost-program-options-dev libevent-dev automake libtool flex bison pkg-config g++ libssl-dev

cd import
tar -xzvf thrift-0.9.0.tar.gz

cd thrift-0.9.0
./configure --with-csharp=no --with-java=yes --with-cpp=no --with-python=no --with-php=no
make

#sudo make install
