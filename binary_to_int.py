#! /usr/bin/env python2
# coding=utf-8

import sys


def binary_to_int(binary):
	# Takes a string argument
	number = 0
	
	for i in range(len(binary), 0, -1):
		if binary[i - 1] == '1':
			number += 2 ** (len(binary) - i)
	
	return number


if __name__ == '__main__':
	if (len(sys.argv) < 2):
		print "Not enough arguments!"
		exit(1)
	
	numbers = ""
	
	for i in range(1, len(sys.argv)):
		numbers += sys.argv[i]
	
	numbers = numbers.split(",")
	# Surprisingly, this line also handles spaces
	
	print [num for num in numbers if ((binary_to_int(num) % 5) == 0)]