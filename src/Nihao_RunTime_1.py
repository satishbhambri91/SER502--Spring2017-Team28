@Author:  Prashanth Radhakrishnan
Purpose : SER 502 Project, ARIZONA STATE UNIVERSITY
Date: 29th April 2017

import operator
import os
import re
import sys

#Assigning meaning to the operators.
operations = {"+" : operator.add(),
              "-" : operator.sub(),
              "*" : operator.mul(),
              "/" : operator.div(),
              ">" : operator.gt(),
              "<" :operator.lt(),
              ">=": operator.ge(),
              "<=": operator.le(),
              "==": operator.eq()}

Operator = 'Operator'
Constant = 'Constant'
Boolean = 'Boolean'
Variable = 'Variable'
WhileTag = 'WhileTag'
IfTag = 'IfTag'


# Defines a list containing a set of set of tuples which hold the (symbol,tag)
token_tags = [ (r'>' , Operator),
               (r'<' , Operator),
               (r'<=', Operator),
               (r'>=', Operator),
               (r'==', Operator),
               (r'+', Operator),
               (r'-', Operator),
               (r'*', Operator),
               (r'/', Operator),
               (r'True', Boolean),
               (r'False', Boolean),
               (r'[0-9]+', Constant),
               (r'[A-Za - z_][A-Za - z0 - 9_] *', Variable)
               (r'do', WhileTag),
               (r'od', WhileTag),
               (r'start', IfTag),
               (r'end', IfTag)]
#Takes the input token stream and token tags list as input, checks for the validity of the token using re.compile and match regex
#generates a list, tokens = [(symbol,tag)]
def lexer(token_stream,token_tags ):
    tokens = []
    position = 0
    token_length = len(token_stream)
    while position < token_length:
        match = 0
        for token_tag in token_tags:
            character, tag = token_tag
            reObject = re.compile(character)
            match = reObject.match(token_stream, position)
            if match and tag:
                expression = match.group(0)
                token = (expression,tag)
                tokens.append(token)
            if not match:
                sys.stderr.write("Invalid character", token_stream[position])
                sys.exit(None)
            else:
                position = match.end(0)
    return tokens





