-- https://www.hackerrank.com/challenges/japanese-cities-attributes/problem

SELECT id, name, countrycode, district, population
FROM city
WHERE countrycode = 'JPN';