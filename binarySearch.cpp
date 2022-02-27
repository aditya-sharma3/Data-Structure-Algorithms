#include<iostream>
using namespace std;

int main()
{
    int list[] = {2, 4, 5, 7, 9, 11, 15, 26};
    int key, low = 0, high = 8;

    cout<<"The list is as follows: "<<endl;
    for(int i=0; i<8; i++)
    {
        cout<<list[i]<<endl;
    }
    cout<<"Enter element to search: ";
    cin>>key;

    while(low <= high)
    {
        int mid = (low+high)/2;

        if(key == list[mid])
        {
            cout<<"Element is present at "<<mid<<endl;
            return 0;
        }
        else if(key < list[mid])
            high = mid-1;
        else    
            low = mid+1;
        
    }

    cout<<"not present...";
    return 0;
}