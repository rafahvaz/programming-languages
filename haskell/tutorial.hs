import Data.List

doubleMe x = x + x

doubleUs x y = x*2 + y*2

doubleSmallNumber x =
  if x < 100
    then x*2
    else x

numbers = [1,2,3,4,5,6,7]

r = 5.0

-- subtract 12 from the half part of the supplied arg --

subtractByTwelve a = a/2 - 12

-- volume of a box --

squareVol x y = x * y

boxVol x y h = (squareVol x y) * h

absolute x
  | x < 0       = -x
  | otherwise  = x

pts 1 = 10
pts 2 = 6
pts x
    | x <= 6 && x > 0  = 7 - x
    | otherwise = 0

roots a b c =
  let sdisc = sqrt (b * b - 4 * a * c)
      twice_a = 2 * a
  in ((-b + sdisc) / twice_a,
      (-b - sdisc) / twice_a)


f x = x + 3
square x = x ^ 2

revWords :: String -> String
revWords input = (unwords . reverse . words) input