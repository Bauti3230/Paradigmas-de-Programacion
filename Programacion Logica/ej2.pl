progenitor(a,b).  % 1
progenitor(a,c).  % 2
progenitor(b,d).  % 3
progenitor(b,e).  % 4
progenitor(c,f).  % 5

hermanos(X,Y) :- progenitor(Z,X),progenitor(Z,Y), X\=Y.
primos(X,Y) :- progenitor(Z,X),progenitor(W,Y),hermanos(Z,W).
nieto(X,Y) :- progenitor(Z,X),progenitor(Y,Z).

descendiente(X,Y) :- progenitor(Y,X).
descendiente(X,Y) :- progenitor(Z,X), descendiente(Z,Y).