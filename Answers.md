TOP 10 MOST FREQUENT WORDS:
1. the=33282
2. of=18016
3. and=12849
4. a=12717
5. to=12450
6. in=9387
7. was=7788
8. that=6601
9. he=6202
10. his=5529

1) Try using a `TreeMap` instead of a `HashMap`. Does this make any difference?
  - The tests take a longer time to complete with a `TreeMap` than with a `HashMap`.
2) What happens if you invoke `countWords` multiple times for different String iterators?
  - All the string iterators would be placed in the same map and list
3) What crucial role does the Iterator abstraction play in making `WordCounter` testable?
  - The iterator allows for entries to be added to the map so that it's not empty, and thus non-testable.
