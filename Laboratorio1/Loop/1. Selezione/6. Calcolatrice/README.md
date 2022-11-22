# Calcolatrice

Scrivere un programma che legga da **riga di comando** un numero reale, `a`, un simbolo di operazione aritmetica (`+`, `-`, `*` o `/`), ed un secondo numero reale `b`.
Il programma deve calcolare e stampare a video il risultato dell'operazione specificata tra i due numeri. Se l'operatore non è riconosciuto il programma invece deve stampare `Operatore non riconosciuto`.
Si utilizzi il costrutto switch per selezionare l'operazione in base al simbolo inserito.

##### Esempio d'esecuzione:

```text
$ java calcolatrice 3.1 + 6.0
risultato: 9.1

$ java calcolatrice 4 - 2
risultato: 2

$ java calcolatrice 10 * 4.5
risultato: 45

$ java calcolatrice 10 / 2
risultato: 5

$ java calcolatrice 10 % 2
Operatore non riconosciuto
```
