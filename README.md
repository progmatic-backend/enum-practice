# Enumeráció


## 4. Haladó feladatok
### 4.a Véletlenszerű érték 

Írj egy metódust a `Month` osztályba, ami visszaad egy véletlenszerű hónapot!
Még nem tanultuk, de neki egy osztáylszintű metódusnak kell lennie, hogy ne úgy kelljen meghívnunk, hogy
`Month.JUNE.getRandomMonth()` hanem, hogy `Month.getRandomMonth()`.
Érdemes külön változóba elmenteni a hónapokat, ezt a `Month.values()` metódussal tudod megtenni.

Ha kész, írasd ki egy random hónap magyar nevét csupa kisbetűvel!

Megoldás (csak akkor nézd meg, ha próbálkoztál):
```
public static Month getRandomMonth() { // <- static metódus, mert osztályszintű, nem egy adott példányhoz kapcsolódik
    Random random = new Random(); // <- ezt is érdemesebb lenne elmenteni osztályszintű (static) változóként, csak még nem tanultuk:)
    Month[] months = Month.values();
    return months[random.nextInt(months.length)];
    // VAGY külön változó nélkül: return Month.values()[random.nextInt(Month.values().length)];
}
```

### 4.b D&D játék bővítése
Módosítsd a szombaton megírt Dungeons and Dragons játékodat, hogy a `Monster`-nek legyen egy `MonsterType`
enumja (pl. GOBLIN, ORC, UNDEAD) és a `Character`-nek egy `CharacterClass` enum változója 
(pl. WARRIOR, MAGE, ROGUE, CLERIC)!
Írj ezekhez az enumokhoz metódusokat, használd őket a játékodban!