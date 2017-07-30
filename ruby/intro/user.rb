module Destructable
    def destroy(anyObject)
        puts "Object will be destroyed"
    end
end

class User
    include Destructable
    attr_accessor :name, :age
    def initialize(name, age)
        @name = name
        @age = age
    end

    def run
        puts "running...."
    end
end

user = User.new("John", "20")

puts User.ancestors
puts user.instance_variable_set('@name', 'Mark')
puts user.instance_variable_get('@name')

puts user.name
puts user.age

user.age = 25

puts user.age

class Buyer < User
    def self.someMethod
        puts "a class method similar to the Java's static method"
    end
end

buyer = Buyer.new "Craig", 30

puts buyer

puts Buyer.ancestors

puts Buyer.someMethod

user.destroy('something')

buyer.destroy('anything')

