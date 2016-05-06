grammar Regex;

init : expr EOF ;

expr : '.'              # dot
     | CHAR             # char
     | ESCAPE           # escape
     | expr '*?'        # repetitionStarNonGreedy
     | expr '+?'        # repetitionPlusNonGreedy
     | expr '??'        # repetitionQuestionMarkNonGreedy
     | expr '*'         # repetitionStarGreedy
     | expr '+'         # repetitionPlusGreedy
     | expr '?'         # repetitionQuestionMarkGreedy
     | expr expr        # concatenation
     | expr '|' expr    # alternation
     | '[' set ']'      # charSet
     | '(' expr ')'     # capturingGroup
     ;

set : NONBRACKET+ ;

ESCAPE : '\\' '\\'
       | '\\' '|'
       | '\\' '*'
       | '\\' '?'
       | '\\' '+'
       | '\\' '('
       | '\\' ')'
       | '\\' '.'
       | '\\' '['
       | '\\' ']'
       ;

CHAR :  ~[\\|*?+().[\]] ;

NONBRACKET: ~[\]] ;