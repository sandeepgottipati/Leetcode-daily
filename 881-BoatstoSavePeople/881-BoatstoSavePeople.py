class�Solution:
����def�numRescueBoats(self,�people:�List[int],�limit:�int)�->�int:
��������
��������people=�sorted(people)
��������i,j=0,len(people)-1
��������boats=0
��������while(i<=j):
������������if(people[i]+people[j]<=limit):
����������������i+=1
����������������j-=1
������������else:
����������������j-=1
������������boats+=1
��������return�boats

[1,2]
