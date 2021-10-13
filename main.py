import pandas as pd

df = pd.read_csv('BABA.csv')

print(df.columns) 
# print(df.to_string()) 
#print(df["Date"])


def MovingDayAverage(days, start):
    total =0
    i=start
    for i in range(start, days+start):
        total += (df["High"][i]+df["Low"][i])/2
    # print(df["Date"][days+start-1])
    return total/days

bought=False
boughtPrice=0
soldPrice=0
total=0
for i in range(200):
    mda50=int(MovingDayAverage(50, 0+i))
    mda20=int(MovingDayAverage(20, 30+i))
    mda9=int(MovingDayAverage(41, 9+i))
    print("9 day average: " + str(mda9) +". 20 day average:"+ str(mda20) +". 50 day average:"+ str(mda50))
    if mda20>mda50 and mda9>mda20 and not bought:
        boughtPrice=df["Open"][50+i]
        print(boughtPrice)
        bought=True
    if bought and (mda20<mda50 or mda9<mda20):
        soldPrice=df["close"][50+i]
        print(soldPrice)
        bought=False
        total+=boughtPrice-soldPrice
        boughtPrice=0
if boughtPrice != 0:
    total+=df["close"][50+200]
print(total)