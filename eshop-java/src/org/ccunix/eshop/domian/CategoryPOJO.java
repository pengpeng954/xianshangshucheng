package org.ccunix.eshop.domian;

    /*
     * POJO  持久化Java对象
     * */
    public class CategoryPOJO {
        //主键
        private Integer id;
        //主键
        private String cateName;
        //主键
        private String cateDesc;


        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getCateName() {
            return cateName;
        }

        public void setCateName(String cateName) {
            this.cateName = cateName;
        }

        public String getCateDesc() {
            return cateDesc;
        }

        public void setCateDesc(String cateDesc) {
            this.cateDesc = cateDesc;
        }
    }

