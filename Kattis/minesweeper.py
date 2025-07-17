# Minesweeper

# Geting input; 0 = row, 1 = column, 2 = number of pairs the hack printed
input_list = input().split()
mine_location = set()
all_location = set()

for i in range(int(input_list[2])):
    r, c = input().split()
    mine_location.add((r, c))

count = 0
output = ""

for i in range(int(input_list[0])):
    for j in range(int(input_list[1])):
        if (str(i+1), str(j+1)) in mine_location:
            output += "*"
        else:
            output += "."
        count += 1
        if count%int(input_list[1]) == 0:
            output += "\n"

print(output)