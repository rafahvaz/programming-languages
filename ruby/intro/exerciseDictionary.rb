# ----------------------- EXERCISE 1 ---------------------- #

# 1. Create a dictionary (hash) with 10 city names, where the city name would be a string and the key, and the area code would be the value

# 2. Display the city names to the user which are available in the dictionary

# 3. Get input from the user on the city name (hint: use gets.chomp method)

# 4. Display area code based on user's city choice

# 5. Loop - keep the program running and prompt the user for new city names to lookup

# 6. Method to look up area code, this will take in a hash of the dictionary and the city name and will output area code

# 7. Method to display just city names

# 1

cityDictionary = {
    "Fortaleza" => "85",
    "São Paulo" => "21",
    "Rio de Janeiro" => "11",
    "Juazeiro do Norte" => "88",
    "Recife" => "83",
    "Brasilia" => "61",
    "Porto Alegre" => "51",
    "Blumenau" => "47",
    "Palmas" => "63",
    "Manaus" => "82"
}

cityDictionary.each do |k, v|
    puts "City name = #{k}"
end

input = gets.chomp

puts cityDictionary[input]

i = 0

def lookupCityAreaCode(hash, city)
    hash[city]
end

def cityNames(areCode)
    cityDictionary.key areaCode
end

while i == 0 do
    puts "Name a city"
    inputValue = gets.chomp
    puts lookupCityAreaCode cityDictionary,inputValue
    puts "Quer continuar?"
    continue = gets.chomp
    if continue == "n"
        i = 1
    end
end