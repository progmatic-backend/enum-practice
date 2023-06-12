# Enumeráció

Nézzünk meg pár extrásabb enumot! Enumokba is tudunk fieldeket, metódusokat és konsturktort írni,
erre találsz példát a `Coffee.java` fájlban!

## 3. Komplex Month Enum 
### 3.a Magyar név eltárolás
Bővítsd a már meglévő `Month` enumot az alábbiak szerint:
- írj egy pontosvesszőt az utolsó enum konstans után (`DECEMBER;`),
erre akkor van szükség, ha kicsit feltuningolt enumot szerenénk készíteni, különben elhagyható
- az új pontosvessző után vegyél fel neki egy `private String hungarianName` változót
- készíts egy konstruktort, ami parméterként vár egy `String hungarianName`-et és 
beállítja ennek a változónak az értékét
```
Month(String hungarianName) {
    this.hungarianName = hungarianName;
}
```
- egészítsd ki az enumjaidat az alábbiak szerint: `JANUARY,` helyére írd, hogy `JANUARY("Január"),`,
tedd meg ezt minden értékre!
- írj egy gettert a `hungarianName` fieldre!
- módosítsd a main() metódusban lévő kódodat, hogy a magyar neveit írja ki a hónapoknak!
  (segítség: `Month.JUNE.getHungarianName()`)

### 3.b Egyéb metódusok
Írj egy metódust a Month enumban, ami eldönti, hogy a hónap nyári hónap-e:
```
public boolean isSummerMonth() {
    return this == JUNE || this == JULY || this == AUGUST;
}
```
Ennek a mintájára írj metódusokat a többi évszakra is és próbáld is ki őket!

### 3.c `ordinal()` használata
Írj egy metódust, ami visszaadja, hogy hányadik hónapról van szó! Ehhez az `ordinal()`-t kell használnod,
ami visszaadja, hogy az enum konstanod milyen indexen van!
```
public int getMonthNumber() {
    return this.ordinal() + 1;
}
```
Írasd ki az összes hónapot az alábbi formátumban!
```
1. hónap: Január
2. hónap: Február
```

## 4. Komplex Seasons Enum
### 4.a `switch` használata
Enumokkal nagyon jól lehet switch-eket használni, írd be az alábbi metódust a `Season` enumba!
```
public static Season getSeasonByMonth(Month month) {
    return switch (month) {
        case MARCH, APRIL, MAY -> SPRING;
        case JUNE, JULY, AUGUST -> SUMMER;
        case SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN;
        case DECEMBER, JANUARY, FEBRUARY -> WINTER;
    };
}
```
Egy hasonló műkődést, mint amit az évszakoknál láttunk meg tudunk valósítani switch-cset használó
metódussal:
```
public String getHungarianName() {
    return switch (this) {
        case SPRING -> "Tavasz";
        case SUMMER -> "Nyár";
        case AUTUMN -> "Ősz";
        case WINTER -> "Tél";
    };
}
```
Mi a különbség a két megoldás között, Te melyiket választanád?


