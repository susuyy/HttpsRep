var vue=new Vue({
    el:"#app",
    data:{
        userList:[],
        user:{}
    },
    methods:{
        /**
         * 查询所有
         */
        findAll:function () {
            axios.get("/user/findAll").then(function (response) {
                vue.userList=response.data
            })
        },

        /**
         * 根据id查询回显数据
         */
        findById:function (id) {
            axios.get("/user/findById/"+id).then(function (response) {
                vue.user=response.data
            })
        },

        /**
         * 修改user数据
         */
        updateUser:function () {
            axios.post("/user/update",vue.user).then(function (response) {
                alert(response.data)
                vue.findAll()
            }).catch(function (response) {
                alert(response.data)
            })
        }
    },
    created:function () {
        this.findAll();
    }
})