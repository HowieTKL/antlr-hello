grammar Hello;
msg   : 'Hello' ID;
ID  : [a-z]+ ;
WS  : [ \t\r\n]+ -> skip ;