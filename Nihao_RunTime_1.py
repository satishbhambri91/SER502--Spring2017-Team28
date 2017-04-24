import operator
import os
import re
import sys


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



















