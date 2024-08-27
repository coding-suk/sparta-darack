package studyWithTutor;

public class Character {
    /**
     * 캐릭터 객체 설계도
     */

        private String name;

        private String status;

        public Character(String name, String status) {
            this.name = name;
            this.status = status;
        }

        public String getStatus() {
            return status;
        }

        // 상태 변경
        public void setStatus(String sta) {
            this.status = sta;
        }
}
