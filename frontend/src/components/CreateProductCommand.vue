<template>
    <v-card outlined>
        <v-card-title>
            CreateProduct
        </v-card-title>

        <v-card-text>
            <String label="ProductId" v-model="value.productId" :editMode="editMode"/>
            <String label="ProductName" v-model="value.productName" :editMode="editMode"/>
            <Number label="Quantity" v-model="value.quantity" :editMode="editMode"/>
            <Money offline label="Price" v-model="value.price" :editMode="editMode" @change="change"/>
            <String label="Category" v-model="value.category" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="createProduct"
            >
                CreateProduct
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateProductCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.productId = '';
            this.value.productName = '';
            this.value.quantity = 0;
            this.value.price = {};
            this.value.category = '';
        },
        watch: {
        },
        methods: {
            createProduct() {
                this.$emit('createProduct', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

