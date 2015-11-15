# collatz
Studying Collatz Conjecture

A Collatz Sequence for a natural number n, C(n), is a sequence whose next term is n/2 if n is even or 3n+1 otherwise.
It is said to terminate at 1, since, it produces a cycle (4 2 1) after that.
Needless to say all powers of 2 terminate very quickly.

# Notes on Scala version
- Build using sbt (http://scala-sbt.org).

## Methods

```
seq(n : Int) : List[Int]
```

- stopping distance is seq(n).length - 1
- largest element is seq(n).max

```
main()
```

- To display stopping distance and max element for C(1) to C(1024)

```
main("debug")
```

- To display collatz sequence, stopping distance and max for C(1) to C(1024)

# References

- Visualization - see [xkcd](http://imgs.xkcd.com/comics/collatz_conjecture.png)
- Wikipedia - see [collatz](https://en.wikipedia.org/wiki/Collatz_conjecture) 
