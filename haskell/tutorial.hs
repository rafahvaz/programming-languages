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