import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public ClubMembers() {
        memberList = new ArrayList<MemberInfo>();
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public ArrayList<MemberInfo> getMemberList() {
        return memberList;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public void setMemberList(ArrayList<MemberInfo> newList) {
        memberList = newList;
    }

    public void addMembers(String[] names, int gradYear) {
        for (String name: names) {
		    MemberInfo info = new MemberInfo(name, gradYear, true);
            memberList.add(info);
        }
    }

    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> removeList = new ArrayList<>();
	    for (int i = 0; i < memberList.size(); i++) {
	        MemberInfo member = memberList.get(i);
	        if (member.getGradYear() <= year) {
                    memberList.remove(i);
			        i--;
			        if (member.inGoodStanding()) {
                        removeList.add(member);
                    }
		        }
            }
	    return removeList;			
    }
}
