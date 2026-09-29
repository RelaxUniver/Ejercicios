actual = nodo_primero
buscar = actual.siguiente
anterior = actual

[a->actual->anterior] => [b->buscar] => [c] => [d] => [b] => null

**ITERACIÓN 1**

CICLO(true) {

SI(buscar != null Y actual.dato == buscar.dato) ENTONCES {

<\<si>>

anterior.siguiente = buscar.siguiente

(new) avance = buscar.siguiente

buscar.siguiente = null

buscar = avance

<\<no>>

buscar = buscar.siguiente

anterior = anterior.siguiente

[a->actual] => [b->anterior] => [c->buscar] => [d] => [b] => null

}

SI (buscar == null) ENTONCES {

<\<si>>

actual = actual.siguiente

SI (actual == null) ENTONCES {

<\<si>>

ROMPER CICLO

}

<\<no>>

buscar = actual.siguiente

anterior = actual

}

}


**ITERACIÓN 2**

CICLO(true) {

SI(buscar != null Y actual.dato == buscar.dato) ENTONCES {

<\<si>>

anterior.siguiente = buscar.siguiente

(new) avance = buscar.siguiente

buscar.siguiente = null

buscar = avance

<\<no>>

buscar = buscar.siguiente

anterior = anterior.siguiente

[a->actual] => [b] => [c->anterior] => [d->buscar] => [b] => null

}

SI (buscar == null) ENTONCES {

<\<si>>

actual = actual.siguiente

SI (actual == null) ENTONCES {

<\<si>>

ROMPER CICLO

}

<\<no>>

buscar = actual.siguiente

anterior = actual

}

}

**ITERACIÓN 3**

CICLO(true) {

SI(buscar != null Y actual.dato == buscar.dato) ENTONCES {

<\<si>>

anterior.siguiente = buscar.siguiente

(new) avance = buscar.siguiente

buscar.siguiente = null

buscar = avance

<\<no>>

buscar = buscar.siguiente

anterior = anterior.siguiente

[a->actual] => [b] => [c] => [d->anterior] => [b->buscar] => null

}

SI (buscar == null) ENTONCES {

<\<si>>
    
actual = actual.siguiente

SI (actual == null) ENTONCES {

<\<si>>

ROMPER CICLO

}

<\<no>>

buscar = actual.siguiente

anterior = actual

}

}

**ITERACIÓN 4**

CICLO(true) {

SI(buscar != null Y actual.dato == buscar.dato) ENTONCES {

<\<si>>

anterior.siguiente = buscar.siguiente

(new) avance = buscar.siguiente

buscar.siguiente = null

buscar = avance

<\<no>>

buscar = buscar.siguiente

anterior = anterior.siguiente

[a->actual] => [b] => [c] => [d] => [b->anterior] => null->buscar

}

SI (buscar == null) ENTONCES {

<<si>>
    
actual = actual.siguiente
    
[a] => [b->actual] => [c] => [d] => [b->anterior] => null->buscar

SI (actual == null) ENTONCES {

<\<si>>

ROMPER CICLO

}

<\<no>>

buscar = actual.siguiente

anterior = actual

[a] => [b->actual->anterior] => [c->buscar] => [d] => [b] => null

}

}

**ITERACIÓN 5**

CICLO(true) {

SI(buscar != null Y actual.dato == buscar.dato) ENTONCES {

<\<si>>

anterior.siguiente = buscar.siguiente

(new) avance = buscar.siguiente

buscar.siguiente = null

buscar = avance

<\<no>>

buscar = buscar.siguiente

anterior = anterior.siguiente

[a] => [b->actual] => [c->anterior] => [d->buscar] => [b] => null

}

SI (buscar == null) ENTONCES {

<\<si>>

actual = actual.siguiente

SI (actual == null) ENTONCES {

<\<si>>

ROMPER CICLO

}

<\<no>>

buscar = actual.siguiente

anterior = actual

}

}

**ITERACIÓN 6**

CICLO(true) {
    
SI(buscar != null Y actual.dato == buscar.dato) ENTONCES {

<\<si>>

anterior.siguiente = buscar.siguiente

(new) avance = buscar.siguiente

buscar.siguiente = null

buscar = avance

<\<no>>

buscar = buscar.siguiente

anterior = anterior.siguiente

[a] => [b->actual] => [c] => [d->anterior] => [b->buscar] => null

}

SI (buscar == null) ENTONCES {

<\<si>>

actual = actual.siguiente

SI (actual == null) ENTONCES {

<\<si>>

ROMPER CICLO

}

<\<no>>

buscar = actual.siguiente

anterior = actual

}

}

**ITERACIÓN 7**

CICLO(true) {

SI(buscar != null Y actual.dato == buscar.dato) ENTONCES {

<\<si>>

anterior.siguiente = buscar.siguiente
    
[a] => [b->actual] => [c] => [d->anterior] => null

(new) avance = buscar.siguiente

[a] => [b->actual] => [c] => [d->anterior] => null->avance

buscar.siguiente = null

[b->buscar] => null

buscar = avance

[a] => [b->actual] => [c] => [d->anterior] => null->avance->buscar

<\<no>>

buscar = buscar.siguiente

anterior = anterior.siguiente

}

SI (buscar == null) ENTONCES {

<\<si>>

actual = actual.siguiente

[a] => [b] => [c->actual] => [d->anterior] => null->buscar

SI (actual == null) ENTONCES {

<\<si>>

ROMPER CICLO

}

<\<no>>

buscar = actual.siguiente
    
anterior = actual

[a] => [b] => [c->actual->anterior] => [d->buscar] => null

}

}

ESTE PROCESO SE REPITE...

**ITERACIÓN X**

CICLO(true) {
    
SI(buscar != null Y actual.dato == buscar.dato) ENTONCES {

<\<si>>

anterior.siguiente = buscar.siguiente

(new) avance = buscar.siguiente

buscar.siguiente = null

buscar = avance

<\<no>>

buscar = buscar.siguiente

anterior = anterior.siguiente

}

SI (buscar == null) ENTONCES {

<\<si>>

actual = actual.siguiente

[a] => [b] => [c] => [d->anterior] => null->buscar->actual

SI (actual == null) ENTONCES {

<\<si>>

**ROMPER CICLO**

}

<\<no>>

buscar = actual.siguiente

anterior = actual

}

}

**CASOS BORDE**

SI (actual == null) ENTONCES {

NO SE PUEDE TRABAJAR CON UN NODO null

}

actual = nodo_primero
buscar = actual.siguiente
anterior = actual

[a->actual->anterior] => null-buscar

SI (buscar == null) ENTONCES {

<\<si>>
NO HAY INF REPETIDA, NO HACER CICLO

}
