class User
    attr_accessor :name, :age
    def initialize(name, age)
        @name = name
        @age = age
    end
end

user = User.new("John", "20")

puts User.ancestors
puts user.instance_variable_set('@name', 'Mark')
puts user.instance_variable_get('@name')

puts user.name
puts user.age