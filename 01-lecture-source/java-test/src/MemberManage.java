import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MemberManage {
    private List<MemberDTO> members = new ArrayList<>();

    //멤버 추가
    public boolean addMemberList(MemberDTO member){
        boolean result ;
        if(members.add(member)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }

    //멤버 조회
    public List<MemberDTO> memberListSelect() {
        return members;
    }


    //이름별 순차 조회
    public List<MemberDTO> ascSortnameList(){
        List<MemberDTO> membersAsc = new ArrayList<>();
        membersAsc.addAll(members);
        membersAsc.sort(new Comparator<MemberDTO>() {
            @Override
            public int compare(MemberDTO o1, MemberDTO o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        return membersAsc;
    }

    //이름별 역으로 조회
    public List<MemberDTO> decSortnameList(){
        List<MemberDTO> membersDec = new LinkedList<>();
        membersDec.addAll(members);
        membersDec.sort(new Comparator<MemberDTO>() {
            @Override
            public int compare(MemberDTO o1, MemberDTO o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });

        return membersDec;
    }

    //나이순차 조회
    public List<MemberDTO> ascSortBirthList(){
        List<MemberDTO> birthsAsc = new LinkedList<>();
        birthsAsc.addAll(members);
        birthsAsc.sort(new Comparator<MemberDTO>() {
            @Override
            public int compare(MemberDTO o1, MemberDTO o2) {
                return o1.getBirth() - o2.getBirth();
            }
        });

        return birthsAsc;
    }

    //나이역순 조회
    public List<MemberDTO> decSortBirthList(){
        List<MemberDTO> birthsDsc = new ArrayList<>();
        birthsDsc.addAll(members);
        birthsDsc.sort(new Comparator<MemberDTO>() {
            @Override
            public int compare(MemberDTO o1, MemberDTO o2) {
                return o2.getBirth() - o1.getBirth();
            }
        });

        return birthsDsc;
    }

    public List<MemberDTO> nameSearchList(String name){
        List<MemberDTO> nameSearchList = new ArrayList<>();
        for(int i = 0; i < members.size(); i++){
            if(members.get(i).getName().equals(name) ){
                nameSearchList.add(members.get(i));
            }
        }
        return nameSearchList;
    }

    public List<MemberDTO> birthSearchList(int birth){
        List<MemberDTO> birthSearchList = new ArrayList<>();
        for(int i = 0; i < members.size(); i++){
            if(members.get(i).getBirth() == birth ){
                birthSearchList.add(members.get(i));
            }
        }
        return birthSearchList;
    }

    public boolean updateMember(int id, String name, int birth){
        boolean old = false;
        MemberDTO updateBefore= null;
        MemberDTO updateAfter = null;
        for(int i = 0; i < members.size(); i++){
            if(members.get(i).getId() == id){
                updateAfter = new MemberDTO(id, name, birth);
                updateBefore = members.set(i, updateAfter);
                old = true;
            }
        }
        if(old){
            System.out.println("업데이트에 성공했습니다.");
            System.out.println(updateBefore+" => "+  updateAfter);
        }
        return old;
    }
    public boolean deleteMember(int id){
        boolean result = false;
        MemberDTO deleteMember = null;
        for(int i = 0; i < members.size(); i++){
            if(members.get(i).getId() == id){
                deleteMember = members.remove(i);
                result = true;
            }
        }

        if(deleteMember != null){
            System.out.println(deleteMember + "를 삭제 완료했습니다.");
        }
        return result;
    }

}
