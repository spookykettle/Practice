# Umferð

cells = int(input()) # the number of cells per lane.
lane = int(input()) # the number of lanes -- # is empty , . is car
l = []
output1 = 0
count_parked = 0
count_empty = 0
for i in range(int(lane)):
    park = input()
    for j in park:
        if j == "#":
            count_parked += 1
        elif j == ".":
            count_empty += 1    
output1 = int(count_empty)/int(cells*lane)

print(output1)
        