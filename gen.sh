#!/bin/bash

thrift --gen java thrift/tutorial.thrift
thrift --gen java thrift/shared.thrift
