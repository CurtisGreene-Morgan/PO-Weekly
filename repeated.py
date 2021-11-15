#! /usr/bin/env python2
# coding=utf-8

def character_split(string, count):
	current = ""
	strings = []
	
	if count > len(string):
		return [string]
	
	while string != "":
		current = string[:count]
		string  = string[count:]
		strings.append(current)
		
	return strings


def repeated(string):
	
	strings = []
	
	if len(string) < 2:
		return False
	
	for i in range(len(string), 1, -1):
		strings = character_split(string, i)
		
		# If there's only one string left after removing duplicates, AND there's more than one string in the original,
		# then the string is constructed of repeating parts.
		if (len(set(strings)) == 1) and (len(strings) > 1):
			return True
	return False


print repeated("aaxxtaaxztaaxxt")