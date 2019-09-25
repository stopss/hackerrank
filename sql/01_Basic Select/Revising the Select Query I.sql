-- https://www.hackerrank.com/challenges/revising-the-select-query/problem

SELECT id, name, countrycode, district, population 
FROM city
WHERE countrycode = 'USA' AND population > 100000;