#! /usr/local/ruby

input = gets.chomp

puts "That is the input = #{input}"

if input.length > 4
    puts "Word longer than 4 characters"
else
    puts "Not that big"
end


def multiply(x, y)
    return x * y
end

puts "The result is = #{multiply(2,3)}"

array = [1,2,3,4,5]