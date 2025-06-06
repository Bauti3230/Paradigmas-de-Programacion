byCar(auckland,hamilton).
byCar(hamilton,raglan).
byCar(valmont,saarbruecken).
byCar(valmont,metz).

byTrain(metz,frankfurt).
byTrain(saarbruecken,frankfurt).
byTrain(metz,paris).
byTrain(saarbruecken,paris).

byPlane(frankfurt,bangkok).
byPlane(frankfurt,singapore).
byPlane(paris,losAngeles).
byPlane(bangkok,auckland).
byPlane(singapore,auckland).
byPlane(losAngeles,auckland).

tramoDirecto(X,Y) :- byCar(X,Y).
tramoDirecto(X,Y) :- byTrain(X,Y).
tramoDirecto(X,Y) :- byPlane(X,Y).
    
travel(X,Y) :- tramoDirecto(X,Y).  % Caso base
travel(X,Y) :- tramoDirecto(X,Z), travel(Z,Y).  % Caso recursivo